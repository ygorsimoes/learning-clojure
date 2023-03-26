(ns learning.courses.alura.legacy.essential.collections.map)

;; Create vector.
(def prices [49 100 200 403 500 600 701])

(defn added-one-if-pair
  "Returns more one if even."
  [value]
  (if (even? value)
    (inc value)
    value))

(println "Map:" (map added-one-if-pair prices))