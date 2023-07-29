(ns learning-clojure.maps)

;; Maps are a collection of key-value pairs.
(def inventory {:potion 1
                :sword  1
                :shield 1})

;; (keys) is a function that returns a collection of keys from a map.
(keys inventory)

;; (vals) is a function that returns a collection of values from a map.
(vals inventory)

;; (get) is a function that returns a value from a map.
(get inventory :potion)

;; (contains?) is a function that returns true if a map contains a key.
(contains? inventory :potion)

;; (assoc) is a function that adds a key-value pair to a map.
(assoc inventory :potion 2)

;; (dissoc) is a function that removes a key-value pair from a map.
(dissoc inventory :potion)

;; (update) is a function that updates a value in a map.
(update inventory :potion inc)

;; (merge) is a function that merges two maps.
(merge inventory {:potion 2 :gold 100})

;; (select-keys) is a function that returns a map with only the specified keys.
(select-keys inventory [:potion :gold])

;; (zipmap) is a function that creates a map from two collections.
(zipmap [:potion :gold] [1 100])

;; (into) is a function that adds a collection of key-value pairs to a map.
(into inventory [[:potion 2] [:gold 100]])