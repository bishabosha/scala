package scala.tools.nsc.tasty

import scala.tools.nsc.tasty.TastyBuffer.NameRef

trait TASTYNameTable { self: TASTYUniverse =>
  val nameAtRef: NameRef => self.symbolTable.TermName
  val signedNameAtRef: NameRef => Option[SignedName[self.symbolTable.TermName, self.symbolTable.TypeName]]
}
