(ns learning.calculator.simple-calculator)

(defn sum
  [a, b]
  (+ a b))

(defn sub
  [a, b]
  (- a b))

(defn mult
  [a, b]
  (* a b))

(defn div
  [a, b]
  (/ a b))

(defn calculator
  "Do the calculation with the four operations."
  [value-of-menu a b]
  (if (== value-of-menu 1)
    (sum a b)

    (if (== value-of-menu 2)
      (sub a b)

      (if (== value-of-menu 3)
        (mult a b)

        (if (== value-of-menu 4)
          (div a b))))))

(println (calculator 4 4 2))