(ns learning.alura.basic.collections.map)

;; Create vector.
(def prices [49 100 200 403 500 600 701])

(defn added-one-if-pair
  [value]
  (if (even? value)
    (inc value)
    value))

;; Return all values +1 (inc).
(println "Map:" (map added-one-if-pair prices))