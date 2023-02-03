package com.android.training.affirmations

import android.content.Context
import com.android.training.affirmations.adapter.ItemAdapter
import com.android.training.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }

}