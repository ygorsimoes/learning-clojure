(ns learning.segundatech.initial.conditionals.if)

(defn tax-just-with-if
  "If salary is less or equal a 1000 not has tax. Above of 1000 and less of 2000
  has 10% tax and above or equal a 2000, tax must be in 20%."
  [salary]
  (if (<= salary 1000)
    salary
    (if (< salary 2000)
      (* salary 0.1)
      (* salary 0.2))))

(defn tax-using-let-function
  "If salary is less or equal a 1000 not has tax. Above of 1000 and less of 2000
  has 10% tax and above or equal a 2000, tax must be in 20%."
  [salary]
  (let [first-rate-tax 0.0
        two-rate-tax 0.1
        three-rate-tax 0.2]
    (if (<= salary 1000)
      (* salary first-rate-tax)
      (if (< salary 2000)
        (* salary two-rate-tax)
        (* salary three-rate-tax)))))


(println (tax-just-with-if 1000))
(println (tax-just-with-if 1050))

(println (tax-using-let-function 2000))
(println (tax-using-let-function 50))