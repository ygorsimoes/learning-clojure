(ns learning.basic.collections.update)

;; Create vector.
(def prices [49 100 200 400 500 600 700])

;; Returns the value at position x(0) appended +1 (inc).
(println (update prices 0 inc))