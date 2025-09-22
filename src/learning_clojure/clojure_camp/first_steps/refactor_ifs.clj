(ns learning-clojure.clojure-camp.first-steps.refactor-ifs)

; Refactor the below code to use a single cond instead of multiple ifs.
; Also, consider re-ordering the conditionals to simplify the logic.

(defn process-value
  [value]
  (if (and (number? value) (> value 10))
    :pretty-big
    (if (and (number? value) (< value 0))
      :negative
      (if (and (number? value) (zero? value))
        :zero
        (if (number? value)
          :small-number
          (if (string? value)
            :a-string
            :something-else))))))

; Solution:
(defn process-value-solution
  [value]
  (cond
    (and (number? value) (> value 10)) :pretty-big
    (and (number? value) (< value 0)) :negative
    (and (number? value) (zero? value)) :zero
    (number? value) :small-number
    (string? value) :a-string
    :else :something-else))


; Result:
(process-value 20)
(process-value-solution 20)


