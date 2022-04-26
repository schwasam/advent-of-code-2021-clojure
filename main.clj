;; namespace alias, e.g io. namespace prefix must be used when referring to type.
;;(ns advent-of-code-2021
;;  (:require [clojure.java.io :as io]))

;; import specific types, e.g. reader. can be used without namespace prefix.
(ns advent-of-code-2021
  (:require [clojure.java.io :refer [reader]]))

(with-open [reader (reader "input.txt")]
  (doseq [line (line-seq reader)]
    (println line)))

;; get current directory
;; (println (System/getProperty "user.dir"))

;; (println "Done!")