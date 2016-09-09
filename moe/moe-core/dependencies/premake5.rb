require "formula"

class Premake5 < Formula
  homepage "http://industriousone.com/premake"
  url "https://github.com/premake/premake-core/releases/download/v5.0.0-alpha5/premake-5.0.0-alpha5-src.zip"
  sha1 "768bfc651b2f6ae380c68a002e25e423eb2facca"

  def install
    system "make -C build/gmake.macosx"

    # Premake has no install target, but its just a single file that is needed
    bin.install "bin/release/premake5"
  end
end
