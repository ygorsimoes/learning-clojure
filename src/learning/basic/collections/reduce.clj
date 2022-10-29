(ns learning.basic.collections.reduce)

;; Create vector.
(def prices [49 100 200 403 500 600 701])
(def price [10])

(defn summing
  [value-1 value-2]
  (println "Summing" value-1 "with" value-2)
  (+ value-1 value-2))

;; Sum all values.
(println "Reduce (+):" (reduce + prices))
(println "Reduce (+):" (reduce + price) "\n")

;; Behind the Scenes.
;; Start the sum with x.
(println "Reduce (+)" (reduce summing 0 prices) "\n")
(println "Reduce (+)" (reduce summing 5 price))