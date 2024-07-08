package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter (var transactionList: List<Transaction>): RecyclerView.Adapter<TransactionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.transaction_list_item, parent, false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
   val transaction = transactionList[position]
        holder.tvTransactionName.text = transaction.transactionName
        holder.tvAmount.text = transaction.amount
        holder.tvDate.text = transaction.date

    }

    override fun getItemCount(): Int {
      return transactionList.size
    }
}

class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var tvTransactionName = itemView.findViewById<TextView>(R.id.tvTransactionName)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var ivProfile = itemView.findViewById<ImageView>(R.id.ivProfile)

}