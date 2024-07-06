(ns test)

(defn run [_]
  (println
    (System/getenv "FOO")))
