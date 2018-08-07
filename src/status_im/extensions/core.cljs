(ns status-im.extensions.core
  (:require [clojure.string :as string]))

;; Hardcoded for gists
(defn url->storage-details [s]
  (when s
    (let [segments (string/split s #"/")]
      [:gist (string/join "/" (take-last 2 segments))])))

