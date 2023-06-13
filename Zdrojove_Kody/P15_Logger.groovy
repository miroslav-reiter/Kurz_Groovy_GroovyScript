package metaprogramming

import java.util.logging.Logger

Logger.metaClass.fyi = { msg -> delegate.info msg }
Logger.metaClass.omg = { msg -> delegate.severe msg }
Logger.metaClass.lol = {msg -> delegate.warning msg}

Logger log = Logger.getLogger(this.class.name)
log.fyi 'for your information'
log.omg 'oh my goodness'
log.fyi "pre tvoju informaciu"
log.lol 'zmenil si heslo'