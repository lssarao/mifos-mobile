package org.mifos.mobile.models.templates.loans

import android.os.Parcelable

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by Rajan Maurya on 16/07/16.
 */

@Parcelize
data class LoanPurposeOptions(

        var id: Int? = null,

        var name: String,

        var position: Int? = null,

        var description: String,

        @SerializedName("isActive")
        var active: Boolean? = null

) : Parcelable