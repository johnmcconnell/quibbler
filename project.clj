(defproject quibbler "0.1.0-SNAPSHOT"
  :description "A library to make acceptance testing feel amazing in clojure."
  :url "https://github.com/johnmcconnell/quibbler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljfmt "0.5.6"]
            [lein-codox "0.10.3"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.seleniumhq.selenium/selenium-java "2.53.1"]
                 [com.codeborne/phantomjsdriver "1.2.1"]
                 [http-kit "2.2.0"]
                 [hiccup "1.0.5"]
                 [clj-webdriver "0.7.2"]
                 [com.cemerick/url "0.1.1"]])
