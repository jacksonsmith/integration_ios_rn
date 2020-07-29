Pod::Spec.new do |s|
    s.name         = "SellingCartApp"
    s.version      = "1.0"
    s.summary      = "SocialSellingModule"
    s.description  = "SocialSellingModule"
    s.homepage     = "https://bitbucket.org/naturacode/social-selling/"
    s.license      = "Private"
    s.author       = { "Roberto e cia" => "" }
    s.source       = { :git => "https://github.com/jacksonsmith/integration_ios_rn.git", :tag => "1.0" }
    s.source_files = "ios/SellingCartApp/**/*.{swift,h,m}"
    s.ios.deployment_target  = '10.0'

    s.resources = 'ios/Pod/Assets/*'
  end