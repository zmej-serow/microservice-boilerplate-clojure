(defproject core "0.1.0-SNAPSHOT"
  :description "simple boilerplate for clojure-based api with mongodb and nginx for https"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]]
  :uberjar-name "release.jar"
  :main core.core
  :profiles {:uberjar {:aot :all}})
