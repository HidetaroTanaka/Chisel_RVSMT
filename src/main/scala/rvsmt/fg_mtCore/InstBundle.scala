package rvsmt.fg_mtCore

import chisel3._
import chisel3.util._

class InstBundle extends Bundle {
  val bits: UInt = UInt(32.W)

  def funct7: UInt    = bits(31,25)
  def rs2: UInt       = bits(24,20)
  def rs1: UInt       = bits(19,15)
  def funct3: UInt    = bits(14,12)
  def rd: UInt        = bits(11,7)
  def opcode: UInt    = bits(6,0)
}

object InstBundle extends Bundle {
  def apply: InstBundle = new InstBundle()
}