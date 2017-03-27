(ns quibbler.core-test
  (:require
   [hiccup.page :refer [html5]]
   [clj-webdriver.taxi :as taxi]
   [clojure.test :refer :all]
   [quibbler.core :refer :all]))

(defn basic-webapp
  [_]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (html5
             {:lang "en"}
             [:head]
             [:body "Hello World!"])})

(reset-handler! basic-webapp)

(use-fixtures :once with-server)

(deftest quibbler-starts-the-server-and-driver-in-the-fixture
  (testing "the body is hello world"
    (is (= "Hello World!" (taxi/text "body")))))
