(defproject lein-bom "0.2.0-atlassian-2-SNAPSHOT"
  :description "A leiningen plugin that provides support for importing maven BOMs"
  :url "https://github.com/tsachev/lein-bom"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.8.1"
  :eval-in :leiningen
  :plugins [[lein-cloverage "1.0.10"]]
  :deploy-repositories [["clojars" {:username :env/CLOJARS_USERNAME :password :env/CLOJARS_PASSWORD}]])
