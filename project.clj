(defproject envisiontest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojars.frozenlock/envision-cljs "0.1.9"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {:builds {:main
                       {:source-paths ["src/envisiontest/cljs"]
                        :compiler {:output-to "resources/public/cljs/main-min.js"
                                   :optimizations :advanced
                                   :pretty-print false}}
                       :dev
                       {:source-paths ["src/envisiontest/cljs"]
                        :compiler {:output-to "resources/public/cljs/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}}})
