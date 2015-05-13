(defproject org.zalando.stups/lein-scm-source "0.2.0"
  :description "Generates source control origin information file."
  :url "https://github.com/zalando-stups/lein-scm-source"

  :license {:name "The Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"
            :distribution :repo}

  :scm {:url "git@github.com:zalando-stups/lein-scm-source.git"}

  :min-lein-version "2.5.0"
  :eval-in-leiningen true

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.6"]]

  :pom-addition [:developers
                 [:developer {:id "sarnowski"}
                  [:name "Tobias Sarnowski"]
                  [:email "tobias.sarnowski@zalando.de"]
                  [:role "Maintainer"]
                  [:timezone "Europe/Berlin"]]]

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/" :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots/" :creds :gpg}})
