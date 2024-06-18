Tutorial:

https://www.stefanwille.com/2021/05/2021-05-30-openapi-code-generator-for-typescript

Example repo with yarn gen and usage examples:

https://github.com/stefanwille/openapi-generator-typescript-example

### 1. Install

The tutorial installs openapi-generator locally. IMHO better to do this globally:

`npm install -g @openapitools/openapi-generator-cli`

##### (Optional) README

After generator installation, find README in

`Users\<User>\AppData\Romaing\npm\node_modules\@openapitools\openapi-generator-cli\README.md`

Note that if you installed with **nvm** the path might be f.i.:

`Users\<User>\AppData\Roaming\nvm\v18.20.3\node_modules\@openapitools\openapi-generator-cli\README.md`

If that's not right, check where node modules are currently installed:

`npm config get prefix`
(This might point to a shortcut/link)

### 2. Verify Installation

Remember to source env and then you should be able to check the version (Which will download the Java execs)

```
PS C:\openapi-generator-cli version
Download 7.6.0 ...
Downloaded 7.6.0
Did set selected version to 7.6.0
```

### 3. Execute generator

Now you can run against a project OAS3 definition (e.g. json-placeholder-api.yaml, or your project api definition yaml):

WSL:

```
openapi-generator-cli generate \
  -i ./json-placeholder-api.yaml \
  -o src/generated-sources/openapi \
  -g typescript-fetch \
  --additional-properties=supportsES6=true,npmVersion=6.9.0,typescriptThreePlus=true
```

PowerShell (note the quotes):

`openapi-generator-cli generate -i .\json-placeholder-api.yaml -o src\generated-sources\openapi -g typescript-fetch --additional-properties 'supportsES6=true,npmVersion=6.9.0,typescriptThreePlus=true'`

You should now find the generated sources in

`<ProjectDir>\src\generated-sources\openapi`

Log of generated files:

`<ProjectDir>\src\generated-sources\openapi\.openapi-generator\FILES`

In this example we generated TypeScript.
But we can just as easily use another generator to generate Java for instance:

`openapi-generator-cli generate -i ./api.yaml -g java -o ./output/java-client`

### 4. Codegen

Can also add to codegen:

`"codegen": "rm -rf src/generated-sources/openapi; openapi-generator-cli generate -i ./json-placeholder-api.yaml -o src/generated-sources/openapi -g typescript-fetch --additional-properties=supportsES6=true,npmVersion=6.9.0,typescriptThreePlus=true"`

### 5. Gradle

##### 1. Add generator plugin
```
plugins {
    id "org.openapi.generator" version "5.2.1"  // Use the latest version available
}
```

##### 2. Configure Task (Example)
```
import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

task generateApi(type: GenerateTask) {
    generatorName = "typescript-fetch"
    inputSpec = "$projectDir/src/main/resources/api.json"  // Path to your OpenAPI spec
    outputDir = "$buildDir/generated-sources/openapi"
    additionalProperties = [
        'supportsES6': 'true',
        'npmVersion': '6.9.0',
        'typescriptThreePlus': 'true'
    ]
    configOptions = [
        modelPackage: 'com.example.api.model',
        apiPackage: 'com.example.api.client'
    ]
}

```

##### 3. Hook into Build Process

`compileJava.dependsOn generateApi`

<br />
If not already done, we also need to integrate npm, e.g.

```
task npmInstall(type: Exec) {
    workingDir 'src/main/ts'  // Adjust this path to where your package.json is located
    commandLine 'npm', 'install'
}

task buildTs(type: Exec, dependsOn: npmInstall) {
    workingDir 'src/main/ts'
    commandLine 'npm', 'run', 'build'
}

generateApi.finalizedBy buildTs
```
