package sourcecode

object TestUtil {

  // FIXME In dotty, scala.util.Properties.versionNumberString is still like 2.12.x
  lazy val isDotty = {
    val cl: ClassLoader = Thread.currentThread().getContextClassLoader
    try {
      cl.loadClass("dotty.DottyPredef")
      true
    } catch {
      case _: ClassNotFoundException =>
        false
    }
  }

}
