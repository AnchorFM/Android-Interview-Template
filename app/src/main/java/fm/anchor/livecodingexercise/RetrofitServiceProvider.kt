package fm.anchor.livecodingexercise

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitServiceProvider {

    private val baseBuilder = Retrofit.Builder()
        .baseUrl("https://pastebin.com/raw/")
        .addConverterFactory(GsonConverterFactory.create())

    fun <T> create(service: Class<T>): T = baseBuilder
        .build()
        .create(service)

    fun <T> createForRxJava(service: Class<T>): T = baseBuilder
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()
        .create(service)
}