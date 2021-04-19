require "formula"

class Premake5 < Formula
  homepage "https://premake.github.io/"
  url "https://github.com/premake/premake-core/releases/download/v5.0.0-alpha16/premake-5.0.0-alpha16-src.zip"
  sha256 "bd1c0944877cf1200a3c5499b893fef2d8af6df6e8b8645b8ba017d258019ba5"

  def install
    system "make -C build/gmake2.macosx"

    # Premake has no install target, but its just a single file that is needed
    bin.install "bin/release/premake5"
  end
end
