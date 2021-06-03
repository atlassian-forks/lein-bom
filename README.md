# lein-bom

[![Build Status](https://travis-ci.org/tsachev/lein-bom.svg?branch=master)](https://travis-ci.org/tsachev/lein-bom)
[![codecov.io](https://codecov.io/github/tsachev/lein-bom/coverage.svg?branch=master)](https://codecov.io/github/tsachev/lein-bom?branch=master)

A Leiningen plugin that provides support for importing Maven "Bill Of Materials" (BOM) dependencies.

[![Clojars Project](https://clojars.org/lein-bom/latest-version.svg)](https://clojars.org/lein-bom)

## Install

Put `[lein-bom "0.2.0-atlassian-1"]` into the `:plugins` vector of your `project.clj`.

## Usage

Specify bom dependencies using `:import` vector in `:bom` map of your `project.clj`.

```clojure
:bom {:import [[com.fasterxml.jackson/jackson-bom "2.9.3"]]}
```

To see actual managed dependencies, run:

```
$ lein bom
```

## Release from local
Since lein release doesn't work for non-semver version so our fork needs special releasing. There are two steps:
* Manually remove `-SNAPSHOT` and then build the uberjar: ```lein uberjar```
* Deploy the jar to packages.atlassian.com: 
```
mvn deploy:deploy-file -DgroupId=lein-bom -DartifactId=lein-bom -DrepositoryId=atlassian-3rdparty -Durl=https://packages.atlassian.com/maven/3rdparty -Dfile=lein-bom-0.2.0-atlassian-2.jar -Dversion=0.2.0-atlassian-2
```


## License

Copyright © 2020

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
