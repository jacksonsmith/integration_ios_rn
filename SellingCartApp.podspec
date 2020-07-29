Pod::Spec.new do |s|
    s.name         = "SellingCartApp"
    s.version      = "1.0"
    s.summary      = "SocialSellingModule"
    s.description  = "SocialSellingModule"
    s.homepage     = "https://bitbucket.org/naturacode/social-selling/"
    s.license      = "Private"
    s.author       = { "Eltin & Gui" => "" }
    s.source       = { :git => "https://github.com/jacksonsmith/integration_ios_rn.git", :tag => "1.0" }
    s.source_files = "ios/SellingCartApp/**/*.{swift,h,m}"
    s.ios.deployment_target  = '10.0'

    s.resources = 'ios/Pod/assets/*'
  
    s.dependency 'React'
    s.dependency 'React-Core'
    s.dependency 'React-CoreModules'
    s.dependency 'React-Core/DevSupport'
    s.dependency 'React-RCTActionSheet'
    s.dependency 'React-RCTAnimation'
    s.dependency 'React-RCTBlob'
    s.dependency 'React-RCTImage'
    s.dependency 'React-RCTLinking'
    s.dependency 'React-RCTNetwork'
    s.dependency 'React-RCTSettings'
    s.dependency 'React-RCTText'
    s.dependency 'React-RCTVibration'
    s.dependency 'React-Core/RCTWebSocket'

  end