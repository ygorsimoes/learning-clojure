(ns learning-clojure.initial.predicates)

(defn apply-discount?
  "Apply discount if the price is greater than 100."
  [price]
  (>= price 100))

(println (apply-discount? 20))
(println (apply-discount? 150))

;; Functions predicates that exists in Clojure:
(println (number? 10))
(println (number? "10"))

(println (string? "10"))
(println (string? 10))

(println (boolean? true))
(println (boolean? "true"))

(println (nil? nil))
(println (nil? "nil"))

(println (empty? []))
(println (empty? ""))
(println (empty? "Hi!"))
(println (empty? {}))
(println (empty? ()))
(println (empty? nil))