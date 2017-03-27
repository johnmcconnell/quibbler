# quibbler
[![Build Status](https://travis-ci.org/johnmcconnell/quibbler.svg?branch=master)](https://travis-ci.org/johnmcconnell/quibbler)

A library to make acceptance testing feel amazing in clojure.

## Getting Started

### Usage

In a standalone state for development

```clojure
(require '[quibbler.core :refer :all])

(defn basic-webapp
  [_]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (html5
              {:lang "en"}
              [:head]
              [:body "Hello World!"])})

(reset-handler! basic-webapp)

(start-server!)
(start-driver!)

(taxi/text "body") ; "Hello World!"
```

Use as part of user acceptance testing for a frontend application

```clojure
(require '[quibbler.core :refer :all])

(defn basic-webapp
  [_]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (html5
              {:lang "en"}
              [:head]
              [:body "Hello World!"])})

(use-fixtures :once with-server)

(deftest quibbler-starts-the-server-and-driver-in-the-fixture
  (testing "the body is hello world"
    (is (= "Hello World!" (taxi/text "body")))))
```

## Development

### Build

Build the application with:

```
  lein build
```

### Testing

Test the application with:

```
  lein test
```

### Documentation

Build the documentation with:

```
  lein codox
```

## License

Copyright © 2017 John McConnell

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
