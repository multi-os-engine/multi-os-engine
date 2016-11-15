require "formula"

class Premake5 < Formula
  homepage "http://industriousone.com/premake"
  url "https://github.com/premake/premake-core/releases/download/v5.0.0-alpha5/premake-5.0.0-alpha5-src.zip"
  sha256 "8bdcf9e5a5502ecc671d978a9d48a3dec91322507a80cec7685d6bbed757435f"

  def install
    system "make -C build/gmake.macosx"

    # Premake has no install target, but its just a single file that is needed
    bin.install "bin/release/premake5"
  end
end
