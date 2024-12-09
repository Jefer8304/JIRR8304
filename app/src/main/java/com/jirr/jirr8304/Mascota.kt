package com.jirr.jirr8304

import androidx.recyclerview.widget.RecyclerView
import class RecyclerView

data class Mascota(
    val nombre: String,
    val rating: Int
)
class MascotaAdapter(private val mascotas: List<Mascota>) :
    RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>() {

    class MascotaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nombreMascota: TextView = view.findViewById(R.id.nombre_mascota)
        private val huesos = listOf(
            view.findViewById<ImageView>(R.id.hueso_1),
            view.findViewById<ImageView>(R.id.hueso_2),
            view.findViewById<ImageView>(R.id.hueso_3),
            view.findViewById<ImageView>(R.id.hueso_4),
            view.findViewById<ImageView>(R.id.hueso_5)
        )

        fun bind(mascota: Mascota) {
            nombreMascota.text = mascota.nombre
            for (i in 0 until 5) {
                huesos[i].setImageResource(
                    if (i < mascota.rating) R.drawable.hueso_amarillo else R.drawable.hueso_blanco
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MascotaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mascota, parent, false)
        return MascotaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MascotaViewHolder, position: Int) {
        holder.bind(mascotas[position])
    }

    override fun getItemCount(): Int = mascotas.size
}