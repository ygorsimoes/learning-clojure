(ns learning.core)

(require '[learning.calculator.simple-calculator :as math])

(defn -main
  "I don't do a whole lot ... yet."
  [& _]

  ;; 1 = Sum
  ;; 2 = Sub
  ;; 3 = Multi
  ;; 4 = Div
  (println (math/calculator 4 4 2)))