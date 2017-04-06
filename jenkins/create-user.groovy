import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

def user= "jenkins";
def password="ER$%751o"

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount(user,password)
instance.setSecurityRealm(hudsonRealm)
instance.save()
