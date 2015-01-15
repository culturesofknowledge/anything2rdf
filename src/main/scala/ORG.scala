
import com.hp.hpl.jena.rdf.model.ResourceFactory

/**
 * @author jiemakel
 *
 */

object ORG {
  val ns = "http://www.w3.org/ns/org#"
  def R(s: String) = ResourceFactory.createResource(ns+s)
  def P(s: String) = ResourceFactory.createProperty(ns+s)
  def Organization = R("Organization")
  def FormalOrganization = R("FormalOrganization")
  def OrganizationalUnit = R("OrganizationalUnit")
  def Role = R("Role")
  def Membership = R("Membership")
  def Site = R("Site")
  def OrganizationalCollaboration = R("OrganizationalCollaboration")
  def ChangeEvent = R("ChangeEvent")
  def Post = R("Post")
  def subOrganizationOf = P("subOrganizationOf")
  def transitiveSubOrganizationOf  = P("transitiveSubOrganizationOf ")
  def hasSubOrganization = P("hasSubOrganization")
  def purpose = P("purpose")
  def hasUnit = P("hasUnit")
  def unitOf = P("unitOf")
  def classification = P("classification")
  def identifier = P("identifier")
  def linkedTo = P("linkedTo")
  def memberOf = P("memberOf")
  def hasMember = P("hasMember")
  def reportsTo = P("reportsTo")
  def member = P("member")
  def organization = P("organization")
  def role = P("role")
  def hasMembership = P("hasMembership")
  def memberDuring = P("memberDuring")
  def roleProperty = P("roleProperty")
  def headOf = P("headOf")
  def remuneration = P("remuneration")
  def siteAddress = P("siteAddress")
  def hasSite = P("hasSite")
  def siteOf = P("siteOf")
  def hasPrimarySite = P("hasPrimarySite")
  def hasRegisteredSite = P("hasRegisteredSite")
  def basedAt = P("basedAt")
  def location = P("location")
  def originalOrganization = P("originalOrganization")
  def changedBy = P("changedBy")
  def resultedFrom = P("resultedFrom")
  def resultingOrganization = P("resultingOrganization")
  def holds = P("holds")
  def heldBy = P("heldBy")
  def postIn = P("postIn")
  def hasPost = P("hasPost")
}
