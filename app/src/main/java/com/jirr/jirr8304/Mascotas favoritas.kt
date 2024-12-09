package com.jirr.jirr8304

class FavoriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.lolita(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MascotaAdapter(getFavoriteMascotas())
    }

    private fun getFavoriteMascotas(): List<Mascota> {
        return listOf(
            Mascota("Mascota1", 5),
            Mascota("Mascota2", 4),
            Mascota("Mascota3", 3),
            Mascota("Mascota4", 2),
            Mascota("Mascota5", 1)
        )
    }
}
