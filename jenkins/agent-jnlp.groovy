import hudson.model.Node.Mode
import hudson.slaves.*
import jenkins.model.Jenkins

// There is a constructor that also takes a list of properties (env vars) at the end, but haven't needed that yet
DumbSlave dumb = new DumbSlave(it,  // Agent name, usually matches the host computer's machine name
        "Auto-created Jenkins agent",           // Agent description
        "/var/jenkins",                  // Workspace on the agent's computer
        "1",             // Number of executors
        Mode.EXCLUSIVE,             // "Usage" field, EXCLUSIVE is "only tied to node", NORMAL is "any"
        "",                         // Labels
        new JNLPLauncher(),         // Launch strategy, JNLP is the Java Web Start setting services use
        RetentionStrategy.INSTANCE) // Is the "Availability" field and INSTANCE means "Always"

Jenkins.instance.addNode(dumb)
