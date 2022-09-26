package com.example.newsbreeze.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@kotlinx.parcelize.Parcelize
data class Source(
    val id: String,
    val name: String
): Parcelable