(ns learning.calculator.core)

(require '[learning.calculator.simple-calculator :as simple-calculator])

(defn -main
  "I don't do a whole lot ... yet."
  [& _]

  ;; 1 = Sum
  ;; 2 = Sub
  ;; 3 = Multi
  ;; 4 = Div
  (println (simple-calculator/calculator 4 4 2)))