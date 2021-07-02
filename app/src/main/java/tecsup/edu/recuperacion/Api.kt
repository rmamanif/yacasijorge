package tecsup.edu.recuperacion

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "f46b58478f489737ad5a4651a4b25079",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}
