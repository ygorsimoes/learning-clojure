(ns learning.alura.basic.collections.filter)

;; Create vector.
(def prices [49 100 200 403 500 600 701])

(println "Filter (odd?):" (filter odd? prices))
(println "Filter (even?):" (filter even? prices))