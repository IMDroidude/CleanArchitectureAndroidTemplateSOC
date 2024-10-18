package com.example.dto.account

import com.example.dto.base.NetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponseDTO(
    @SerialName("ResponseCode")
    val responseCode: String,
    @SerialName("ResponseDescription")
    val responseDescription: String,
    @SerialName("body")
    val body: Body
) : NetworkModel

@Serializable
data class Body(
    @SerialName("accountdetails")
    val accountDetails: AccountDetails,
    @SerialName("personaldetails")
    val personalDetails: PersonalDetails,
    @SerialName("minor")
    val minor: Minor,
    @SerialName("notifications")
    val notifications: Notifications,
    @SerialName("bvs")
    val bvs: Bvs,
    @SerialName("security")
    val security: Security,
    @SerialName("storage")
    val storage: Storage,
    @SerialName("visionCardDetailResponseDTO")
    val visionCardDetailResponseDTO: String? // Assuming this can be null
)

@Serializable
data class AccountDetails(
    @SerialName("IBAN")
    val iban: String,
    @SerialName("AccountTitle")
    val accountTitle: String,
    @SerialName("NadraAccountTitle")
    val nadraAccountTitle: String,
    @SerialName("AccountLevel")
    val accountLevel: String,
    @SerialName("AccountBalance")
    val accountBalance: String,
    @SerialName("AccountType")
    val accountType: String,
    @SerialName("Segment")
    val segment: String,
    @SerialName("CreditedAmount")
    val creditedAmount: String,
    @SerialName("DebitedAmount")
    val debitedAmount: String,
    @SerialName("MerchantStatus")
    val merchantStatus: String,
    @SerialName("Merchant")
    val merchant: String
)

@Serializable
data class PersonalDetails(
    @SerialName("CustomerID")
    val customerID: Int,
    @SerialName("Mobile")
    val mobile: String,
    @SerialName("MobileNetwork")
    val mobileNetwork: String,
    @SerialName("CNIC")
    val cnic: String,
    @SerialName("CNICIssuanceDate")
    val cnicIssuanceDate: String,
    @SerialName("CNICExpiryDate")
    val cnicExpiryDate: String,
    @SerialName("UserID")
    val userID: String,
    @SerialName("Email")
    val email: String,
    @SerialName("Address")
    val address: String,
    @SerialName("DateofBirth")
    val dateOfBirth: String,
    @SerialName("MotherName")
    val motherName: String,
    @SerialName("FatherName")
    val fatherName: String?,
    @SerialName("Gender")
    val gender: String,
    @SerialName("ProfilePicture")
    val profilePicture: String?,
    @SerialName("CNICExpired")
    val cnicExpired: Boolean,
    @SerialName("CNICExpiresInDays")
    val cnicExpiresInDays: String,
    @SerialName("CNICExpiryDescription")
    val cnicExpiryDescription: String,
    @SerialName("FirebaseInviteURL")
    val firebaseInviteURL: String?,
    @SerialName("Theme")
    val theme: Int,
    @SerialName("Balance")
    val balance: Boolean,
    @SerialName("MutualFunds")
    val mutualFunds: Boolean,
    @SerialName("NadraQuestion")
    val nadraQuestion: Boolean
)

@Serializable
data class Minor(
    @SerialName("Minor")
    val minor: Boolean,
    @SerialName("ParentFullName")
    val parentFullName: String?,
    @SerialName("ParentMobileNumber")
    val parentMobileNumber: String?,
    @SerialName("ParentCNICNumber")
    val parentCNICNumber: String?,
    @SerialName("ParentCNIC")
    val parentCNIC: Boolean,
    @SerialName("ParentCNICBack")
    val parentCNICBack: Boolean,
    @SerialName("CNICNumber")
    val cnicNumber: String?,
    @SerialName("BFormPic")
    val bFormPic: String?,
    @SerialName("Selfie")
    val selfie: Boolean,
    @SerialName("CNIC")
    val cnic: Boolean,
    @SerialName("CNICBack")
    val cnicBack: Boolean
)

@Serializable
data class Notifications(
    @SerialName("Money")
    val money: Int,
    @SerialName("Tohfa")
    val tohfa: Int,
    @SerialName("NotificationCount")
    val notificationCount: Int
)

@Serializable
data class Bvs(
    @SerialName("Popup")
    val popup: Boolean,
    @SerialName("BVSBiometricVerification")
    val bvsBiometricVerification: Boolean,
    @SerialName("UltraVerified")
    val ultraVerified: Boolean
)

@Serializable
data class Security(
    @SerialName("Token")
    val token: String,
    @SerialName("EmailPin")
    val emailPin: Boolean,
    @SerialName("OTPPin")
    val otpPin: Boolean,
    @SerialName("MPin")
    val mPin: Boolean
)

@Serializable
data class Storage(
    @SerialName("DashboardItems")
    val dashboardItems: Boolean,
    @SerialName("MoreScreenItems")
    val moreScreenItems: Boolean,
    @SerialName("PaymentsItems")
    val paymentsItems: Boolean
)