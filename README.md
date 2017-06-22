# Definiti - API

For core project, see [Definiti/Definiti](https://github.com/definiti/definiti).

## About this project

This project defines the API for the Definiti project.
It focuses on the API definition, not its implementation in all plugins.

While this project is the reference for all plugin implementations,
it does not guaranty its full implementation.
Please refer to specific plugins to know their compatibility.

## Project structure

The project structure is the following:

```
 definiti-api/
 |
 |-- src/                       # All API files
 |   |-- Boolean.definition     # Definition of Boolean type
 |   |-- Date.definition        # Definition of Date type
 |   |-- ...
 |
 |-- examples/                  # Example of use of the API
 |   |-- Boolean/               # Type Boolean
 |   |   |-- Boolean.def        # Usage in Definiti language
 |   |   |-- Boolean.js         # Usage in Javascript language
 |   |   |-- Boolean.scala      # Usage in Scala language
 |   |   |-- ...
 |   |-- ...
 |
 |-- tests/                     # Test examples to verify the API is valid
 |   |-- Boolean/               # Type Boolean
 |   |   |-- Boolean.js         # Tests in Javascript language
 |   |   |-- Boolean.scala      # Tests in Scala language
```

# How to improve this API

You can submit anytime your pull-request:

* Clone the repository
* Add or update the type you want
* Define the documentation
* Create example in at least one language
* Create tests in at least one language
* Make the pull-request

After reviews by other members of the community and project members,
when the PR seems good enough, it will be merged for the next release.