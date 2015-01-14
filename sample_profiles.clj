{:dev-cfg
 {:env
  {:stingray {:host "https://thehost"
              :protocol :rest ;or :soap
              :rest {:port "port-as-string"
                     :basic-auth-enabled? true
                     :basic-auth-user "rest"
                     :basic-auth-pwd "rest"
                     :insecure? true}
              :soap {:port "port-as-string"
                     :basic-auth-enabled? true
                     :basic-auth-user "soap"
                     :basic-auth-pwd "soap"
                     :insecure? true}}}}}
