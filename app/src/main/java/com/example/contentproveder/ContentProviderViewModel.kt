package com.example.contentproveder

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContentProviderViewModel : ViewModel(){
    var imageSate = mutableStateOf(emptyList<ContentProviderDataItem>())
    fun updateImages(images: List<ContentProviderDataItem>){
        imageSate.value = images
    }


}