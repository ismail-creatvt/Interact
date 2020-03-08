package com.app.creatvt.interact

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class PieChart @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var data = listOf<Pair<Int, Int>>()
    private var piePaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var outerRect = Rect()
    private var innerRect = Rect()
    private var pieRect = Rect()
    private var drawingRect = Rect()

    fun setData(data:List<Pair<Int, Int>>){
        this.data = data
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        calculateRects()
    }

    private fun calculateRects() {
        drawingRect.left = paddingLeft
        drawingRect.right = width - paddingRight
        drawingRect.top = paddingTop
        drawingRect.bottom = height - paddingBottom


    }
}