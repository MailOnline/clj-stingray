{:dev-cfg
 {:env
  {:stingray {:protocol :rest ;or :soap
              :rest {:host "https://thehost"
                     :port "port-as-string"
                     :endpoint "api/tm/2.0"
                     :basic-auth-enabled? true
                     :basic-auth-user "rest"
                     :basic-auth-pwd "rest"
                     :insecure? true}
              :soap {:host "https://thesoaphost"
                     :port "port-as-string"
                     :endpoint "soap"
                     :basic-auth-enabled? true
                     :basic-auth-user "soap"
                     :basic-auth-pwd "soap"
                     :insecure? true}}}}}
