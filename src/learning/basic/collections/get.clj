(ns learning.basic.collections.get)

;; Create vector.
(def prices [49 100 200 403 500 600 701])
(println prices)

;; Print vector in position x(1).
(println (prices 1))
(println (get prices 1))

;; Print vector in position x(15).
;; Return value x(0).
(println (get prices 15 0))

;; Return null.
(println (get prices 15))

;; Return exception.
(println (prices 15))

