package ru.tinkoff.fintech.meowle.presentation.view.fragments.rv_helpers.search

import androidx.recyclerview.widget.DiffUtil
import ru.tinkoff.fintech.meowle.domain.cat.Cat

class CatsSearchDiffCallback : DiffUtil.ItemCallback<Cat>() {
    override fun areItemsTheSame(oldItem: Cat, newItem: Cat): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Cat, newItem: Cat): Boolean {
        return oldItem == newItem
    }
}