package com.akirachix.enwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTransactions.layoutManager = LinearLayoutManager(this)

        displayTransactions()

    }

    fun displayTransactions(){

        val transaction1 = Transaction("","Salary","KESH 40000","1 July 2024")
        val transaction2 = Transaction("","Rent","KESH 16000","2 July 2024")
        val transaction3 = Transaction("","Dividends","KESH 2400","4 July 2024")
        val transaction4 = Transaction("","Electricity","KESH 800","5 July 2024")
        val transaction5 = Transaction("","Internet","KESH 2500","5 July 2024")
        val transaction6 = Transaction("","Shopping","KESH 3500","5 July 2024")
        val transaction7 = Transaction("","Bus fare","KESH 500","10 July 2024")
        val transaction8 = Transaction("","Water Bill","KESH 40000","20 July 2024")
        val transaction9 = Transaction("","assurance","KESH 50000","12 July 2024")

        val transactionList = listOf(transaction1,transaction2,transaction3,transaction4,transaction5,transaction6,transaction6,transaction7,transaction8,transaction9)
        val transactionAdapter = TransactionAdapter(transactionList)
        binding.rvTransactions.adapter = transactionAdapter
    }

}