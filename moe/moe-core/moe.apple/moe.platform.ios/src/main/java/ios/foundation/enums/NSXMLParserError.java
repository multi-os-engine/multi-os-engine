/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package ios.foundation.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSXMLParserError {
	@Generated
	private NSXMLParserError() {
	}

	@Generated
	@NInt
	public static final long InternalError = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long OutOfMemoryError = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long DocumentStartError = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long EmptyDocumentError = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long PrematureDocumentEndError = 0x0000000000000005L;
	@Generated
	@NInt
	public static final long InvalidHexCharacterRefError = 0x0000000000000006L;
	@Generated
	@NInt
	public static final long InvalidDecimalCharacterRefError = 0x0000000000000007L;
	@Generated
	@NInt
	public static final long InvalidCharacterRefError = 0x0000000000000008L;
	@Generated
	@NInt
	public static final long InvalidCharacterError = 0x0000000000000009L;
	@Generated
	@NInt
	public static final long CharacterRefAtEOFError = 0x000000000000000AL;
	@Generated
	@NInt
	public static final long CharacterRefInPrologError = 0x000000000000000BL;
	@Generated
	@NInt
	public static final long CharacterRefInEpilogError = 0x000000000000000CL;
	@Generated
	@NInt
	public static final long CharacterRefInDTDError = 0x000000000000000DL;
	@Generated
	@NInt
	public static final long EntityRefAtEOFError = 0x000000000000000EL;
	@Generated
	@NInt
	public static final long EntityRefInPrologError = 0x000000000000000FL;
	@Generated
	@NInt
	public static final long EntityRefInEpilogError = 0x0000000000000010L;
	@Generated
	@NInt
	public static final long EntityRefInDTDError = 0x0000000000000011L;
	@Generated
	@NInt
	public static final long ParsedEntityRefAtEOFError = 0x0000000000000012L;
	@Generated
	@NInt
	public static final long ParsedEntityRefInPrologError = 0x0000000000000013L;
	@Generated
	@NInt
	public static final long ParsedEntityRefInEpilogError = 0x0000000000000014L;
	@Generated
	@NInt
	public static final long ParsedEntityRefInInternalSubsetError = 0x0000000000000015L;
	@Generated
	@NInt
	public static final long EntityReferenceWithoutNameError = 0x0000000000000016L;
	@Generated
	@NInt
	public static final long EntityReferenceMissingSemiError = 0x0000000000000017L;
	@Generated
	@NInt
	public static final long ParsedEntityRefNoNameError = 0x0000000000000018L;
	@Generated
	@NInt
	public static final long ParsedEntityRefMissingSemiError = 0x0000000000000019L;
	@Generated
	@NInt
	public static final long UndeclaredEntityError = 0x000000000000001AL;
	@Generated
	@NInt
	public static final long UnparsedEntityError = 0x000000000000001CL;
	@Generated
	@NInt
	public static final long EntityIsExternalError = 0x000000000000001DL;
	@Generated
	@NInt
	public static final long EntityIsParameterError = 0x000000000000001EL;
	@Generated
	@NInt
	public static final long UnknownEncodingError = 0x000000000000001FL;
	@Generated
	@NInt
	public static final long EncodingNotSupportedError = 0x0000000000000020L;
	@Generated
	@NInt
	public static final long StringNotStartedError = 0x0000000000000021L;
	@Generated
	@NInt
	public static final long StringNotClosedError = 0x0000000000000022L;
	@Generated
	@NInt
	public static final long NamespaceDeclarationError = 0x0000000000000023L;
	@Generated
	@NInt
	public static final long EntityNotStartedError = 0x0000000000000024L;
	@Generated
	@NInt
	public static final long EntityNotFinishedError = 0x0000000000000025L;
	@Generated
	@NInt
	public static final long LessThanSymbolInAttributeError = 0x0000000000000026L;
	@Generated
	@NInt
	public static final long AttributeNotStartedError = 0x0000000000000027L;
	@Generated
	@NInt
	public static final long AttributeNotFinishedError = 0x0000000000000028L;
	@Generated
	@NInt
	public static final long AttributeHasNoValueError = 0x0000000000000029L;
	@Generated
	@NInt
	public static final long AttributeRedefinedError = 0x000000000000002AL;
	@Generated
	@NInt
	public static final long LiteralNotStartedError = 0x000000000000002BL;
	@Generated
	@NInt
	public static final long LiteralNotFinishedError = 0x000000000000002CL;
	@Generated
	@NInt
	public static final long CommentNotFinishedError = 0x000000000000002DL;
	@Generated
	@NInt
	public static final long ProcessingInstructionNotStartedError = 0x000000000000002EL;
	@Generated
	@NInt
	public static final long ProcessingInstructionNotFinishedError = 0x000000000000002FL;
	@Generated
	@NInt
	public static final long NotationNotStartedError = 0x0000000000000030L;
	@Generated
	@NInt
	public static final long NotationNotFinishedError = 0x0000000000000031L;
	@Generated
	@NInt
	public static final long AttributeListNotStartedError = 0x0000000000000032L;
	@Generated
	@NInt
	public static final long AttributeListNotFinishedError = 0x0000000000000033L;
	@Generated
	@NInt
	public static final long MixedContentDeclNotStartedError = 0x0000000000000034L;
	@Generated
	@NInt
	public static final long MixedContentDeclNotFinishedError = 0x0000000000000035L;
	@Generated
	@NInt
	public static final long ElementContentDeclNotStartedError = 0x0000000000000036L;
	@Generated
	@NInt
	public static final long ElementContentDeclNotFinishedError = 0x0000000000000037L;
	@Generated
	@NInt
	public static final long XMLDeclNotStartedError = 0x0000000000000038L;
	@Generated
	@NInt
	public static final long XMLDeclNotFinishedError = 0x0000000000000039L;
	@Generated
	@NInt
	public static final long ConditionalSectionNotStartedError = 0x000000000000003AL;
	@Generated
	@NInt
	public static final long ConditionalSectionNotFinishedError = 0x000000000000003BL;
	@Generated
	@NInt
	public static final long ExternalSubsetNotFinishedError = 0x000000000000003CL;
	@Generated
	@NInt
	public static final long DOCTYPEDeclNotFinishedError = 0x000000000000003DL;
	@Generated
	@NInt
	public static final long MisplacedCDATAEndStringError = 0x000000000000003EL;
	@Generated
	@NInt
	public static final long CDATANotFinishedError = 0x000000000000003FL;
	@Generated
	@NInt
	public static final long MisplacedXMLDeclarationError = 0x0000000000000040L;
	@Generated
	@NInt
	public static final long SpaceRequiredError = 0x0000000000000041L;
	@Generated
	@NInt
	public static final long SeparatorRequiredError = 0x0000000000000042L;
	@Generated
	@NInt
	public static final long NMTOKENRequiredError = 0x0000000000000043L;
	@Generated
	@NInt
	public static final long NAMERequiredError = 0x0000000000000044L;
	@Generated
	@NInt
	public static final long PCDATARequiredError = 0x0000000000000045L;
	@Generated
	@NInt
	public static final long URIRequiredError = 0x0000000000000046L;
	@Generated
	@NInt
	public static final long PublicIdentifierRequiredError = 0x0000000000000047L;
	@Generated
	@NInt
	public static final long LTRequiredError = 0x0000000000000048L;
	@Generated
	@NInt
	public static final long GTRequiredError = 0x0000000000000049L;
	@Generated
	@NInt
	public static final long LTSlashRequiredError = 0x000000000000004AL;
	@Generated
	@NInt
	public static final long EqualExpectedError = 0x000000000000004BL;
	@Generated
	@NInt
	public static final long TagNameMismatchError = 0x000000000000004CL;
	@Generated
	@NInt
	public static final long UnfinishedTagError = 0x000000000000004DL;
	@Generated
	@NInt
	public static final long StandaloneValueError = 0x000000000000004EL;
	@Generated
	@NInt
	public static final long InvalidEncodingNameError = 0x000000000000004FL;
	@Generated
	@NInt
	public static final long CommentContainsDoubleHyphenError = 0x0000000000000050L;
	@Generated
	@NInt
	public static final long InvalidEncodingError = 0x0000000000000051L;
	@Generated
	@NInt
	public static final long ExternalStandaloneEntityError = 0x0000000000000052L;
	@Generated
	@NInt
	public static final long InvalidConditionalSectionError = 0x0000000000000053L;
	@Generated
	@NInt
	public static final long EntityValueRequiredError = 0x0000000000000054L;
	@Generated
	@NInt
	public static final long NotWellBalancedError = 0x0000000000000055L;
	@Generated
	@NInt
	public static final long ExtraContentError = 0x0000000000000056L;
	@Generated
	@NInt
	public static final long InvalidCharacterInEntityError = 0x0000000000000057L;
	@Generated
	@NInt
	public static final long ParsedEntityRefInInternalError = 0x0000000000000058L;
	@Generated
	@NInt
	public static final long EntityRefLoopError = 0x0000000000000059L;
	@Generated
	@NInt
	public static final long EntityBoundaryError = 0x000000000000005AL;
	@Generated
	@NInt
	public static final long InvalidURIError = 0x000000000000005BL;
	@Generated
	@NInt
	public static final long URIFragmentError = 0x000000000000005CL;
	@Generated
	@NInt
	public static final long NoDTDError = 0x000000000000005EL;
	@Generated
	@NInt
	public static final long DelegateAbortedParseError = 0x0000000000000200L;
}
